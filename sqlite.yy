#select_stmt
query:
    #with_rule 
	select_or_value compound_order_or_limit ;

subquery:
	SELECT * FROM A ; #Prevents too many subqueries

with_rule:
    | WITH recursive common_table_expression CTE_cont ;

recursive:
    | RECURSIVE ;

CTE_cont:
    | | | , common_table_expression CTE_cont ;

select_or_value:
	#values_rule |
	select_rule ;

select_rule:
    SELECT distinct_all result_column RC_cont from_rule where_rule group_by_rule ;

distinct_all:
    | DISTINCT | ALL ;

RC_cont:
    | , result_column RC_cont ;

from_rule:
    FROM from_clause ;

from_clause:
    x_table ToS_cont | join_clause ;

x_table:
	_table AS X ;

table_or_subquery_list:
	table_or_subquery ToS_cont ;

ToS_cont:
    | | | , table_or_subquery ToS_cont ;

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

common_table_expression:
    _table column_name_list AS ( subquery ) ;

column_name_list:
    ( _field field_cont ) ;

field_cont:
    | , _field field_cont ;

compound_operator:
    UNION | UNION ALL | INTERSECT | EXCEPT ;

expr:
	literal_value |
	database_column |
	expr binary_operator literal_value |
	# expr null |
	expr is_not expr;

literal_value:
	_mediumint | _char(1) | _varchar(32) | _english ;

database_column:
	# _database . _table . _field |
	# _table . _field |
	X . _field ;

binary_operator:
	+ | - | * | / ;

null:
	ISNULL | NOTNULL | NOT NULL ;

is_not:
	IS | IS NOT ;

join_clause:
    x_table join_clause_cont;

join_clause_cont:
	| join_operator table_or_subquery_list join_constraint join_clause_cont ;

join_operator:
	, | join_type JOIN ;

join_type:
	LEFT | LEFT OUTER |
	INNER |
	CROSS |
	;

join_constraint:
	ON expr |
	USING ( column_name_list ) |
	;

ordering_term:
    expr asc_desc;

asc_desc:
	| ASC | DESC ;

result_column:
	* |
	# _table . * |
	expr as_alias ;

table_or_subquery:
	( subquery ) as_alias |
    _table as_alias ;

as_alias:
	| AS _varchar(10) ;
