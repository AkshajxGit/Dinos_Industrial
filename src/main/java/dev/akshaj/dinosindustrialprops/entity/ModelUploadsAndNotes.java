package dev.akshaj.dinosindustrialprops.entity;

public record ModelUploadsAndNotes() {
}


//models added 8/5/2026
//notes: all cones (and cone cart) should be able to rotate on 15 degree intervals when placed, like a mob head
//cone cart acts like a stonecutter, and all cone types should be able to be turned into each other via the menu
//TrafficCone_Test serves as the base model to put into the cone cart, crafted vertically with 2 orange wool surrounding 1 white wool

//list of models:
//Cone_Cart, DriversED_Cone, Parking_Cone, Tall_Thin_Cone, Thin_Cone, Traffic_Barrel, Traffic_Pole
//TrafficCone_Medium (and stacks 3,6,+8), TrafficCone_Short (stacks 2,4,+7), TrafficCone_Tall (stacks 3,5,+7)
//TrafficCone_Test, Vertical_Panel_Plasticade1



//models added 8/16/2026
//packout notes: the 3 packout blocks should be able to be stacked together and mined collectively
//like a stackable shulker box. each has their own maintained inventory that is separate from the others
//the packouts can be stacked up to 3 blocks tall (meaning a max of 12 quarters or 8 halves)
//the 1 block version can only be placed once in a stack, and only on the bottom
//the rest can be placed in any order up to the 3 block height
//storage amount of 9-slot lines: full block gets 12 rows, half block gets 5 rows, quarter block gets 2 rows
//the packouts should be able to rotate on the 15 degree axis
//packouts can be separated by shift mining, but regular mining breaks the whole 3-block stack
//crafting recipe: barrel in center, 1 shulker shell on top, 2 black dye, and 4 orange dye
//that recipe is for the quarter version, which can be combined together to make a half (and same with halves for a full)
//when the half/full version is put in the crafting table by themselves, they can be split into 2 of the lower tier
//if possible, when up crafting, maintain inventory
//if possible, when down crafting, spit inventory out into the world
//if those are not possible, please add some sort of warning about lost inventory when crafting full blocks

//fertilizer notes: non-open versions can be stacked up to 4 in a single block
//bags can be "opened" by right clicking on them with a hoe
//when opened, you can plant any kind of plant that can be placed into a flower pot
//when planted, it will duplicate the planted item with the same regularity as watered farmland
//only non-opened versions can be upgraded (and can be stacked to 4)
//the upgraded, opened, version can be attached to a hopper to extract the duplicating item
//its basically a way to have a compact flower farm
//crafting recipe for regular: dirt in center, paper on 4 sides, and 4 bonemeal in corners
//upgrading crafting recipe: regular bag with a single diamond
//rotatable on the 15 degree axis
//both normal and upgraded display (and hold) up to 9 items in a 3x3 grid on top of the bag
//if possible, randomize which of the 3x3 slots gets filled when placing/duplicating plants
//the placed plant gets removed with an empty hand right click or by breaking the block
//when an upgraded has a hopper below, it will not remove the original one planted (which can only be swapped via player)

//vending machine notes: basically a food gacha machine
//when right-clicked with an emerald, will spit out a random food item (should be able to include modded food)
//rotatable on the 15 degree axis
//crafting recipe: enchanted golden apple in the center, 4 iron blocks, and 4 of the respective dye in the corners

//list of models:
//Packout_1Block, Packout_HalfBlock, Packout_QuarterBlock
//Fertilizer_Bag, Fertilizer_Bag_Open, Fertilizer_Bag_Upgraded, Fertilizer_Bag_Upgraded_Open
//VendingMachine_Black, VendingMachine_Gray, VendingMachine_White


//models added afternoon 8/16/2026
//concrete notes: the cement mixer is another remade stonecutter, which is meant to be able to put in any concrete
//and turn them into either the concrete wall blocks or the concrete barrier block
//if you put any concrete powder in, you can get the concrete bag
//the concrete wall blocks (and bags) stack like slabs into a full block, but instead of 2, it uses 3
//if either stack is broken, it will drop the appropriate number of the stackable bags/wall pieces
//all are rotatable on the 15 degree axis
//the bags can be turned into walls by surrounding a water bucket with them in a crafting table, they cannot be turned in the world

//list of models:
//Cement_Mixer, Concrete_Bag_Flat_Stack(1 through 3), Concrete_Wall_Flat_Stack(1 through 3), Concrete_Barrier


//textures added afternoon 8/16/2026
//cooling lava notes: there are 4 stages, they can be changed inside a stonecutter from obsidian
//and can be turned back into obisidian
//they are meant to go alongside the solid lava/water blocks for create mod copycat blocks

//iron bar notes: there are 8 different textures here, they are meant to be both a retextured iron bar block,
//and a solid block with this texture on all sides
//they can be made in a stonecutter from iron bars (both block and bar versions)
//just literally add retextured versions of iron bars, and please maintain transparency with the solid blocks
//they are also meant for create mod copycat blocks

//list of textures:
//cooling_lava_stage(1 through 4), iron_bar_bigmesh, iron_bar_chainmesh, iron_bar_diagonalmesh, iron_bar_mesh,
//iron_bar_thickmesh, iron_bar_webcenter, iron_bar_webmesh, iron_bar_webplatform


//model and texture updates 8/28/2026
//Traffic_Barrel_v2 has been uploaded and should replace the previous model file. It uses the same textures, just different item appearance.
//gravelballs and sandballs texture pngs have been uploaded (Gravel_Pile and Sand_Pile)
//names should be updated to Gravel Pile and Sand Pile respectively


//models added afternoon 8/29/2026
//barrel notes: these can rotate on the 15 degree angles
//if possible, can these be added to the player head slot, all with an armor value of 4
//when placed, items can be input, just like the large pots from vanilla

//cardboard box notes: these can rotate on the 15 degree angles
//when placed, items can be input, just like the large pots from vanilla
//Cardboard_Box_4 is unique, in that normally it is empty, but when a cat walks over it, it goes into the box, updating the model with the cat
//Box 4 should change which cat texture is used based on the specific cat that walks over it
//Box 4 should have the same creeper repelling properties (and other related things) that a cat has
//when Box 4 is broken, the cat is released, and (whichever is easier) the cat retains their ownership or switches to the closest player
//Box 4 uses the default vanilla texture for the cat, so just use those

//wooden crate notes: these can rotate on the 15 degree angles
//when placed, items can be input, just like the large pots from vanilla
//please keep the block placement hitbox at 1 block in size, even if the crates are bigger (so we can build right next to them)
//if possible, can these be added to the player head slot, all with an armor value of 6
//the wooden crate slabs are stackable like a normal slab

//wooden pallet notes: this can rotate on the 15 degree angles
//this is stackable up to 2 in one blockspace (like a normal slab) use Wooden_Pallet_2 for the stacked version

//tablesaw notes: this can rotate on the 15 degree angles
//this is the workstation for all the crates/pallets/carboard boxes/barrels
//crafting recipe: stonecutter in the center, surrounded by iron ingots
//reuse a stonecutter system, with planks used for crates/pallets, barrels for barrels, and bookshelves for cardboard boxes

//list of models:
//Barrel models: Barrel_Firkin, Barrel_Hogshead, Barrel_Rundlet, Barrel_Tierce, Barrel_Tun
//Cardboard Box models numbered 1-6
//Wooden_Pallet, Wooden_Pallet_2
//WoodenCrate_1x1, WoodenCrate_1x2, WoodenCrate_2x2, WoodenCrate_2x2x2, WoodenCrate_Slab1, WoodenCrate_Slab2
//Tablesaw


//models added evening 8/29/2026
//riot armor notes: I couldn't quite figure out how to make it properly into armor, but I made it as close as I could, with groupings for limbs
//and fake body parts in the model (that are turned off) which in addition to the display settings show how it should sit on a player
//crafting recipes are respective iron armor in center, with respective chainmail armor on top, surrounded by leather (or tinted glass in the case of the helmet)
//add crafting recipe for chainmail armor with the typical crafting arrangements but using chains instead
//stats:
//helmet: armor - 3, toughness - 1, durability - 325, enchantability - 10, knockback res - 2
//chestplate: armor - 7, toughness - 1, durability - 500, enchantability - 10, knockback res - 2
//leggings: armor - 5, toughness - 1, durability - 450, enchantability - 10, knockback res - 2
//boots: armor - 3, toughness - 1, durability - 400, enchantability - 10, knockback res - 2

//riot baton notes: basically a sword rework, with a little added on
//please make it so that the baton has an innate knockback 2 enchantment (so when it has knockback 2 on it, it adds to knockback 4)
//crafting recipe: iron block in the middle, stick below, with iron nuggets in the corners and chains filling the other slots
//stats: (use iron sword for missing values)
//attack - 7, crit - 10, speed - 1.5, sweep damage - 2, durability - 1250, enchantability - 10

//riot shield notes: just reuse the normal shield, but double the durability
//crafting recipe: shield in the center, iron block above+below, 6 leather on the sides

//welding mask notes: use stats from iron helmet
//crafting recipe: iron helmet in the center, tinted glass on 3 bottom, iron ingots on the sides, nothing in top 3

//safety helmet notes: use stats from iron helmet
//crafting recipe: gold helmet in center, gold ingots in the corners, iron ingots everywhere else
//if possible, (if not, don't worry about it) please reduce damage taken from kinetic energy by 50%

//safety vest notes: use stats from leather chestplate
//crafting recipe: leather chestplate in the center, orange wool to left+right, white wool to top+bottom, iron nuggets in corners
//if possible, please make it so that the invisibility effect still happens but no longer functions while worn
//if possible, please make it so that the glowing effect's duration is doubled when applied while worn
//please add an innate projectile protection 3 to the armor (so that when it is enchanted with projectile protection 4 it would be like it is 7)

//dino's short sword notes: a custom weapon for me (it is meant to be an endgame item, btw)
//crafting recipe inside a smithing table: netherite sword, netherite upgrade, netherite block
//stats:
//attack - 10, crit - 15, attack speed - 1.2, sweep damage - 2, durability - 4000, enchantability - 15
//please add a 5 second withering effect and a 15 second poison 2 effect when attacking
//please add the crushing blow ability of the axe to this weapon
//please add the armor piercing ability of an iron axe to this weapon

//list of models added:
//Dino's_ShortSword, Hardhat, Riot_Baton, Riot_Boots, Riot_Chestplate, Riot_Helmet, Riot_Leggings, Riot_Shield, Safety_Vest, Welding_Mask


//models added late evening 8/29/2026
//welding machine notes: the metal-block crafting (stonecutter based) station (which is for everything else that I don't specify a crafting recipe for)
//crafting recipe: bucket of lava in the center, fire charge on top, flint and steel below, with 6 iron ingots
//rotatable on the 15 degrees

//welding tank notes: rotatable on the 15 degrees
//iron ingot in welding machine

//hydrant notes: rotatable on the 15 degrees
//when right clicked with an empty bucket (or empty bottle), will fill the bucket with water
//iron ingot in welding machine
//can be dye swapped between yellow and red (with respective dyes)

//propane tank notes: rotatable on the 15 degrees
//iron ingot in welding machine

//gas can notes: rotatable on the 15 degrees
//empty bottle in welding machine

//porta-john notes: rotatable on the 15 degrees
//bone block in welding machine

//list of models added:
//Blue_PortaJohn, Green_PortaJohn, Gas_Can_1, Gas_Can_2, PropaneTank_(Small/Medium/Large), Red_Hydrant, Yellow_Hydrant,
//Welding_Machine, WeldiongTank_(Small/Medium/Large)


//models added night 8/29/2026
//bollard notes: all except concrete bollard are made in the welding machine for 1 iron ingot
//rotatable on the 15 degrees
//concrete bollard made in the cement mixer for 1 concrete (any color)
//others are 1 iron ingot at welding machine

//cart notes: rotatable on the 15 degrees
//please keep the block hitboxes at no bigger than 1 block (so I can build next to them)
//iron ingot at welding machine

//trashcan notes: rotatable on the 15 degrees
//when placed, items can be input, just like the large pots from vanilla
//iron ingot at welding machine

//dumpster notes: rotatable on the 15 degrees
//when placed, items can be input, just like the large pots from vanilla
//please keep the block hitboxes at no bigger than 1 block (so I can build next to them)
//iron ingot at welding machine

//list of models added:
//Black_Bollard, Concrete_Bollard, Yellow_Bollard, Yellow_StripedBollard, YellowBlack_Bollard
//Flat_Cart, Sheet_Cart, Shopping_Basket, Shopping_Cart, Shopping_Cart_Double, Table_Cart
//Black_Metal_Trashcan, Metal_Trashcan, Black_Trashcan, Blue_Trashcan, Green_Trashcan, Lidless_Dumpster, Medium_Dumpster, Short_Dumpster


//models added night 8/29/2026
//lights notes: rotatable on the 15 degrees
//by default it is off and turns on with a constant redstone current
//can be waxed to be toggleable (so it will turn on and stay on with a single redstone pulse)
//can be unwaxed (like any copper block) with an axe
//redstone lamp at welding machine
//there are only the 2 model files, with differing textures for on/off
//please maintain rotation when toggling on/off
//redstone signal can be detected from the block above the block that the light is placed under
//as in, the light is placed underneath a brick block, with redstone on top of the bricks, and it can detect the redstone on top of the bricks

//metal drum notes: rotatable on the 15 degrees
//light gray drum is the base and is crafted at the welding machine for 1 iron ingot
//any drum can be dyed into any other drum in a crafting table with the appropriate dye

//list of models added:
//LED_Thin_Light, LED_Wide_Light, Metal_Drum_(all 16 colors)


//models added night 8/29/2026
//ladder notes: placeable on any block side (just like normal ladders)
//they do not need a supporting block
//iron ingot at welding machine
//dye shifting between with respective dyes

//stair notes: rotatable on the 90 degrees
//use the stair block hitbox, and if possible can you please prevent players/mobs from walking off the side of the stairs (Like Macaw's bridge stairs)
//they do not change state when next to other stairs and does not bend around corners
//iron ingot at welding machine
//dye shifting between with respective dyes

//stair rail notes: can be placed on any block side
//does not need a supporting block
//can be inverted with a shiftclick (as in the same block side, just changing which side is up)
//iron ingot at welding machine
//dye shifting between with respective dyes
//these use the metal stair textures, fyi

//metal rail notes: can be placed on any block side
//can be placed on multiple, specific, block sides within 1 block (like Macaw's rails)
//iron ingot at welding machine
//dye shifting between with respective dyes

//list of models added:
//Black_Ladder, Gray_Ladder, Orange_Ladder
//Black_Metal_Stairs, Gray_Metal_Stairs, Orange_Metal_Stairs
//Black_Metal_StairRail, Gray_Metal_StairRail, Orange_Metal_StairRail
//Black_Metal_Rail, Gray_Metal_Rail, Orange_Metal_Rail


//models added night 8/29/2026
//wet floor sign notes: rotatable on the 15 degrees
//iron ingot at welding machine

//flagger sign notes: rotatable on the 15 degrees
//iron ingot at welding machine

//metal table notes: rotatable on the 15 degrees
//iron ingot at welding machine

//safety line notes: rotatable on the 15 degrees
//yellow wool at welding machine
//this includes Safety_Line_Joint

//speed bump notes: rotatable on the 15 degrees
//yellow wool at welding machine

//traffic barrier notes: rotatable on the 15 degrees
//iron ingot at welding machine
//please keep the block hitbox at the default 1 block size

//list of models added:
//Wet_Floor_Sign, Flagger_Sign, Metal_Table_(1 through 3),Safety_Line_(1 through 3), Safety_Line_Joint,
//Traffic_Barrier_Large, Traffic_Barried_Med_1, Traffic_Barrier_Med_2, Traffic_Barrier_Small, Speed_Bump


//models added night 8/29/2026
//Water cooler notes: rotatable on the 15 degrees
//water bucket at welding machine
//when any are right clicked with an empty bucket/bottle will fill with water

//cart notes: rotatable on the 15 degrees
//iron ingot at welding machine

//wheelbarrow notes: rotatable on the 15 degrees
//iron ingot at welding machine

//hose spool notes: rotatable on the 15 degrees
//water bucket at welding machine
//when right clicked with an empty bucket/bottle will fill it with water

//hand truck notes: rotatable on the 15 degrees
//iron ingot at welding machine

//pallet jack notes: rotatable on the 15 degrees
//iron ingot at welding machine

//rolling stair notes: rotatable on the 15 degrees
//please note that the model in blockbench is 1 block below where I want it to sit (relative to the other blocks) since I want it to be 2.5 blocks tall
//iron ingot at welding machine
//if the below is not possible/too difficult, disregard and just keep the hitbox at the default
//I would like to be able to climb up this block like stairs (at whatever rotation it is at)
//I would also like to be kept on the stairs by the handrails on the sides (so I can't walk off)

//list of models added:
//Drawer_Cart, Gray_Wheelbarrow, Hand_Truck, Hose_Spool, Orange_Wheelbarrow, Pallet_Jack, Pull_Cart, Wheel_Cart,
//Rolling_Stairs, WaterCooler_Jug_Side, WaterCooler_Jug_Up, WaterCooler_Mobile, WaterCooler_Stationary


//models added night 8/29/2026
//riot wall notes: rotatable on the 15 degrees
//default state is down (with model display showing the up version)
//can be toggled to up with a constant redstone signal by default
//can be waxed to allow it to be toggled by a single redstone pulse (and can be de-waxed with an axe)
//can detect redstone signal through the block directly below the wall
//as in, the wall is placed on top of a brick block, with a redstone line below the bricks, and the wall can detect the redstone
//shield at welding machine
//if the below is not possible/too hard, please disregard it and use a carpet block's hitbox
//I would like the walls to be able to block projectiles and other damage-dealing effects at any rotation
//imagine the fun pvp-style stuff that could be done with it
//and when it is toggled up/down, the hitbox should change to reflect its size/rotation
//please respect rotation when toggled between states with redstone

//list of models added:
//Riot_Wall(1 through 3)_(Up and Down)



//these are the last of the models/textures to be uploaded. Looking forward to seeing them in the mod!