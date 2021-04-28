select person.id, person.name, (
    select count(*) from call_trxn where call_trxn.p_id = person.id
    )from person


# 可以使用group by