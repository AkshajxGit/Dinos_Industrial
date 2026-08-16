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
