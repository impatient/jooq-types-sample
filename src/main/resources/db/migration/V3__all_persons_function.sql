create function all_persons() returns full_person_record[]
AS $$ select array_agg(persons.fpr)
    from (select ROW(ROW(p.id, p.name)::udt_person,
    array_agg(ROW(a.id, a.address_1, a.city)::udt_address),
    array_agg(ROW(p2.id, p2.digits)::udt_phone))::full_person_record as fpr
from person p
    left join address a on p.id = a.person_id
    left join phone p2 on p.id = p2.person_id
    group by p.id, p.name) as persons   ; $$
    LANGUAGE SQL;
