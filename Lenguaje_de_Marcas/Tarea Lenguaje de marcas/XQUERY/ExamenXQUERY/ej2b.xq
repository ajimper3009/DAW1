(:
b. Obtener todos los ríos que pasan por países de Europa
:)

let $doc := doc("geografia.xml")


for $rio in $doc//rio
where $rio/pais = "Francia" and $rio/pais = "Suiza"

return 
<Rio>{$rio/nombre/text()}</Rio>