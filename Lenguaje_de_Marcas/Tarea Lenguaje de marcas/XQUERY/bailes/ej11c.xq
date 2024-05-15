let $baile_mas_caro := max(
  for $baile_precio in doc("bailes.xml")//bailes/baile/precio
  return
  $baile_precio/../@id
)
for $baile in doc ("bailes.xml")//bailes/baile
where $baile/@id = $baile_mas_caro
return
<baile_mas_caro>
<nombre>{$baile/nombre/text()}</nombre>
<id>{$baile_mas_caro}</id>
</baile_mas_caro>