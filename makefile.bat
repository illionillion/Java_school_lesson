@REM for文でファイル作成
@REM for /l %n in (1,1,20) do type > test%n.html
@REM ターミナル上で変数使うなら%は一つだけ、.batなら%%で二つ使う
for /l %%n in (1,1,20) do (type > test%%n.html)
@REM for文でファイル削除
@REM for /l %n in (1,1,20) do del test%n.html
for /l %%n in (1,1,20) do (del test%%n.html)