#select_stmt
query:
    with_rule select_or_value compound_order_or_limit ;

with_rule:
    | WITH recursive common_table_expression CTE_cont ;

recursive:
    | RECURSIVE ;

CTE_cont:
    | , common_table_expression CTE_cont ;

select_or_value:
    select_rule | values_rule ;

select_rule:
    SELECT distinct_all result_column result_column RC_cont from_rule where_rule group_by_rule ;

distinct_all:
    | DISTINCT | ALL ;

RC_cont:
    | , result_column RC_cont ;

from_rule:
    | FROM from_clause ;

from_clause:
    table_or_subquery ToS_cont | join_clause ;

ToS_cont:
    | , table_or_subquery ToS_cont ;

where_rule:
    | WHERE expr ;

group_by_rule:
    | GROUP BY expr_list having_rule ;

expr_list:
	expr expr_cont ;

expr_cont:
    | , expr expr_cont ;

having_rule:
    | HAVING expr ;

values_rule:
    VALUES values_list ;

values_list:
    ( expr_list ) VL_cont ;

VL_cont:
    | , values_list VL_cont ;

compound_order_or_limit:
    compound_operator select_or_value |
    compound_operator select_or_value |
	order_by_rule limit_rule ;

order_by_rule:
    | ORDER BY ordering_term OT_cont ;

OT_cont:
    | , ordering_term OT_cont ;

limit_rule:
    | LIMIT expr limit_modifier ;

limit_modifier:
    | OFFSET expr | , expr ;

common_table_expr:
    table_name column_name_list AS ( select_stmt ) ;

column_name_list:
    | ( _field field_cont ) ;

field_cont:
    | , _field field_cont ;

compound_operator:
    UNION | UNION ALL | INTERSECT | EXCEPT ;

expr:
    FAKE_EXPR ;

join_clause:
    FAKE_JOIN_CLAUSE ;

ordering_term:
    FAKE_ORDERING_TERM ;

result_column:
    FAKE_RESULT_COLUMN ;

table_or_subquery:
    FAKE_TABLE_OR_SUBQUERY ;
