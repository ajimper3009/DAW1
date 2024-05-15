(:Obtener el nombre del baile con el precio mas caro:)

let $maximo := max (
for $baile in doc("bailes.xml")//bailes/baile
return $baile/precio/text()
)

for $baile in doc("bailes.xml")//bailes/baile
where $baile/precio = $maximo
return $baile/nombre/text()