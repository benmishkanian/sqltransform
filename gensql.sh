perl ~/project/randgen/gensql.pl \
        --queries=1 \
        --seed=$1 \
        --dsn=dbi:mysql:host=127.0.0.1:port=19300:user=root:database=sqlite \
        --grammar=grammars/sqlite.yy       \
| tail --lines=1
