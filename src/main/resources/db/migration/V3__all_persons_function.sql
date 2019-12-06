create function all_persons()
    -- https://github.com/jOOQ/jOOQ/issues/7406
    returns table (person    udt_person, addresses udt_address[], phones    udt_phone[])
AS $$
select ROW (p.id, p.name)::udt_person,
       addr,
       pho
from person p
         left join (select a.person_id, array_agg(ROW (a.id, a.address_1, a.city)::udt_address) as addr
                    from address a
                    group by a.person_id) as addr on p.id = addr.person_id
         left join (select p2.person_id, array_agg(ROW (p2.id, p2.digits)::udt_phone) as pho
                    from phone p2
                    group by p2.person_id) as pho on p.id = pho.person_id;
$$
    LANGUAGE SQL;
