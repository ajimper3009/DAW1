(:Mostrar los bailes con id mayor a 3:)
for $baile in doc("bailes.xml")//baile
where $baile/@id > 3
return $baile/nombre/text()