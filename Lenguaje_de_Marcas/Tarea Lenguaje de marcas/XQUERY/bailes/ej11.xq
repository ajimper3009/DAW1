(:Obetener el importe total recaudado por cada baile:)

for $baile in doc("bailes.xml")//bailes/baile
return 
<baile>
<nombre>
{$baile/nombre/text()}
</nombre>
<importe_total>
{$baile/precio/text()*$baile/plazas/text()}
</importe_total>
</baile>