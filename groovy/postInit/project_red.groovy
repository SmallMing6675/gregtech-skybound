crafting.removeByOutput(item('projectred-transmission:wire'))
crafting.removeByOutput(item('projectred-core:resource_item', 310))
crafting.removeByOutput(item('projectred-core:resource_item', 311))
crafting.remove('projectred-transmission:insulated/red_insulated_wire')
crafting.remove('projectred-transmission:insulated/white_insulated_wire')
crafting.remove('projectred-transmission:insulated/orange_insulated_wire')
crafting.remove('projectred-transmission:insulated/gray_insulated_wire')
crafting.remove('projectred-transmission:insulated/light_gray_insulated_wire')
crafting.remove('projectred-transmission:insulated/blue_insulated_wire')
crafting.remove('projectred-transmission:insulated/lime_insulated_wire')
crafting.remove('projectred-transmission:insulated/yellow_insulated_wire')
crafting.remove('projectred-transmission:insulated/pink_insulated_wire')
crafting.remove('projectred-transmission:insulated/black_insulated_wire')
crafting.remove('projectred-transmission:insulated/green_insulated_wire')
crafting.remove('projectred-transmission:insulated/light_blue_insulated_wire')
crafting.remove('projectred-transmission:insulated/magenta_insulated_wire')
crafting.remove('projectred-transmission:insulated/cyan_insulated_wire')
crafting.remove('projectred-transmission:insulated/purple_insulated_wire')
crafting.remove('projectred-transmission:insulated/brown_insulated_wire')
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 251))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 252))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 301))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 600))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 105))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 104))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 103))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 102))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 100))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 101))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 202))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 201))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 200))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 300))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 250))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 400))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 402))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 401))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 410))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 420))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 421))
mods.jei.ingredient.yeet(item('projectred-core:drawplate'))
mods.jei.ingredient.yeet(item('projectred-transmission:framed_wire', 34))
mods.jei.ingredient.yeet(item('projectred-transmission:wire', 34))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 312))
mods.jei.ingredient.yeet(item('projectred-core:resource_item', 342))

crafting.addShapeless('red_alloy_wire', item('projectred-transmission:wire'), [metaitem('wireGtSingleRedAlloy')])
crafting.addShapeless('red_insulated_wire', item('projectred-transmission:wire', 15), [metaitem('cableGtSingleRedAlloy')])

crafting.addShaped('red_silicon_compound', item('projectred-core:resource_item', 310), [
	[item('minecraft:redstone'),item('minecraft:redstone'),item('minecraft:redstone')],
	[item('minecraft:redstone'),metaitem('wafer.silicon'),item('minecraft:redstone')],
	[item('minecraft:redstone'),item('minecraft:redstone'),item('minecraft:redstone')]])
	
crafting.addShaped('glowing_silicon_compound', item('projectred-core:resource_item', 311), [
	[item('minecraft:glowstone_dust'),item('minecraft:glowstone_dust'),item('minecraft:glowstone_dust')],
	[item('minecraft:glowstone_dust'),metaitem('wafer.silicon'),item('minecraft:glowstone_dust')],
	[item('minecraft:glowstone_dust'),item('minecraft:glowstone_dust'),item('minecraft:glowstone_dust')]])