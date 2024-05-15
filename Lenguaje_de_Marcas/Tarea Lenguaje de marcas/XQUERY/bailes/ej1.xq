(:1.- Muestra el nombre de todos los bailes:)
for $nodo_baile in doc("bailes.xml")//baile/nombre
where $nodo_baile/precio > 40
return
<baile>
<nombre>
{$nodo_baile/nombre/text()}
</nombre>
<precio>
{$nodo_baile/precio/text()}
</precio>
</baile>