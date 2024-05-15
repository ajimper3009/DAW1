(: 
Obtener una lista ordenada alfabéticamente por el nombre de cada país.
Ejemplo:
<ol>
<li>Argentina</li>
<li>España</li>
<li>Francia</li>
<li>Jamaica</li>
<li>Suiza</li>
<li>Uruguay</li>
</ol> 
:)

let $doc := doc("geografia.xml")

for $paises in $doc//pais/@nombre
order by $paises ascending

return
<ol>
<li>{$paises}</li>
</ol>

