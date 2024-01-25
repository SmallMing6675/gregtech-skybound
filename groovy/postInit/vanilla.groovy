ore('dirt').add(item('minecraft:dirt', 1))
mods.gregtech.fluid_solidifier.recipeBuilder()
  .fluidInputs(liquid('glue')*144)
  .notConsumed(metaitem('shape.mold.ball'))
  .outputs(item('minecraft:slime_ball'))
  .EUt(30)
  .duration(80)
  .buildAndRegister()

mods.gregtech.centrifuge.removeByInput(30, [item('minecraft:dirt')], null)
mods.gregtech.centrifuge.recipeBuilder()
  .inputs(ore('dirt'))
  .chancedOutput(metaitem('plant_ball')*1, 3000, 1200)
  .chancedOutput(item('minecraft:sand')*1, 5000, 1200)
  .chancedOutput(metaitem('dustTinyClay')*1, 5000, 900)
  .chancedOutput(item('minecraft:bone')*1, 5000, 1200)
  .EUt(30)
  .duration(80)
  .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
  .inputs(metaitem('dustSmallUraniumTriplatinum')*4, metaitem('dustSmallUranium235')*2, metaitem('dustSmallTungstenCarbide')*2, metaitem('dustSmallEnderEye')*4)
  .fluidInputs(liquid('rocket_fuel')*1500)
  .outputs(metaitem('dustNetherStar')*2)
  .EUt(510)
  .duration(3000)
  .buildAndRegister()

mods.gregtech.mixer.recipeBuilder()
  .inputs(item('minecraft:redstone'), metaitem('dustGold'))
  .outputs(item('minecraft:glowstone_dust')*2)
  .EUt(30)
  .duration(100)
  .buildAndRegister()

crafting.addShapeless('gravel_to_flint', item('minecraft:flint'), [item('minecraft:gravel'), item('minecraft:gravel'), item('minecraft:gravel')])