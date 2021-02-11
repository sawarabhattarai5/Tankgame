# tankgame

# Project Overview
For this project, I implemented the Tank Game. It java based and the main idea of the game was to learn and implement Object Oriented Programming.The developer's guide contains information on how to use the games and how they function internally. The Tank Game is a two-player which is shooting game, attacking and scoring game.

# Introduction of the Tank game (general idea)
I used an Object-Oriented Programming and an Observer Pattern, as well as Inheritance. I used 12 classes to create the game. It also uses resource file along with all the classes that supports all the elements required for the game. In this game, object collide with other objects. Mini map, health, lifeline and spit view is also included in the game.

# Development environment
a. Version of Java Used: Java 11.0.3
b. IDE Used: IntelliJ IDEA 2019.2.2 (Ultimate edition)

# How to Build/Import your Project
First, Open git bash clone the repository from GitHub.Then, Open the IntelliJ app and click on Import Project and then get the folder where your game is stored and import it. Next select on create project from existing sources and do next. After that it asks for project name, write the same name as your folder that you got from git hub and do next. Then, keep doing next until you reach the page where it says finish and click on the finish button. Then you can see the build tab on top of the IntelliJ app where you can see build project or find the build icon and click on it build your project.

# Commands that were ran when building the JAR. Or Steps taken to build jar.

The steps that I took to create the jar is that on IntelliJ I went to files and clicked on project structure. Then a window appeared and then on the left side of the window we can see many options and from the option I clicked on artifacts and clicked on the plus sign that appears in the window where I clicked on the JAR option and clicked on empty. Then I selected the main of the
game and then the window with META/MANIFEST file appeared and I clicked on the ok button. After that I went on the build tab on top of the window and clicked on build artifact and selected the option build. This is how I created my jar. It got created on the out folder inside artifact so to run it from IntelliJ I clicked on out and opened the jar and did right click and choose the option run the jar and my game opened on the jar.

# How to run your game. As well as the rules and controls of the game.
To run the game open the main of the program which is Game_Start for tank game. Then, the first way is to locate and click the small green button at the top of the window. Another way to run your program is to click on the "Run" tab at the top of the window. We can also run the jar to run the game.

# Rules to control my Tank game:
Player 1: Up Arrow: Move forward
Down Arrow: Move backward
Right Arrow: Rotate right
Left Arrow: Rotate left
Enter: Shoot bullets

Player 2:
"W": Move forward
"S": Move backward
"D": Rotate right
"A": Rotate left
Spacebar: Shoot bullets

# Tank Rules:
Each player starts with a score of 0 and has two lives and a full health bar that is red in color and a white circle dot which is the life of the player/tank.
Once one player shoots another tank and the tank gets hit by the bullet the health bar color changes to yellow.
Once the health bar is empty the player/tank explodes and gets back to the beginning position.
Once the player/tank gets exploded twice the game is over and white dot which is the life of tank gets removed and scores can be seen.

# Class Descriptions of classes specific to Tank Game

# Object (ImageObject and GameObject)
ImageObject is used for tank game. This is an abstract class that is the parent class of all other game objects (Tanks, Walls,bullets, etc.). It contains a basic draw function that the objects can use. It also supplies all methods and fields that the objects have in common, including object width, height, y-position, and y-position.

# Control (Control_Panel and GameControl)
Control_Panel is used for tank game. This class extends Observable and implements KeyListener. It checks which keys are pressed and then invokes the corresponding object’s (Tank) method. The main class has a Control (Control_Panel) object for each moveable object (Tank).

# Wall (Wall and GameWall)
Wall is used in tank game. This class extends the object class that is listed above. It contains the resources to create the wall and supplies methods for wall width, height, and width height for map.

# Game_Start
It is the main class of the game. This is a public class and plays the background music of
the game from a given resource file. It also creates a new frame and creates a new Control_Panel for my game.
# Frame
This is a public class which extends JFrame. The game title is set in this class and it also creates a thread for Game_Panel.
# Game_Panel
This is an abstract class. It extends JPanel and implements Runnable. It contains BufferedImage which holds all the images for background image and tank image. BufferedImage is also used for mini-map and split screen, which take a subimage of the main image and for the minimap it is scaled down. The most important thing this class does is calls update and draw on all game objects. It also calls the class GameAnime and works on graphics of the components.
# GameAnime
This is a public class which controls the picture_icons elements and also draws the images for the icons. This class also help create the frame as the object(tank) of the game moves.
# Tank
This class extends ImageObject. This class also has an update method to move/rotate Tank. One of the most import things the Tank class does is checks for collisions with walls, and other tanks. It uses Rectangle for draw method and collision checks.
# Wall
This class extends ImageObject. It uses a BufferedReader and BufferedImage to read a .txt file containing the positions of the walls and stores values in wallMap 2D String array. It has method setUpdatedWallMap that is called when breakable walls are shot (changes value in wallMap array). “1” = unbreakable wall, “2” = breakable wall. It has method setUpdatedWallMap that is called when breakable walls are shot (changes value in wallMap array).
# Tank_Bullet
This class extends GameAnimet. It contains an update method that moves bullet until it hits wall or tank. The class also has methods to check for collision with walls / tanks. If the bullet collides with a breakable wall it calls setUpdatedWallMap in the Wall class, changing the array element to 0. It uses rectangle for wall and bullet.
# Player
Each Player object corresponds to a Tank object. It handles health, lives, and score. When
a bullet hits a tank, the Player objects are called to update the health and score accordingly.
# Sound_Effect
This class for the sound to play continously.

# Project Conclusion
Overall, this project helped learn how to effectively develop Java games and complex applications with many interacting classes. I learned concepts such as Object-Oriented Programming and Inheritance. I was also able to implement the Observer Pattern, which was very new to me. I think the skills I learned will definitely be useful in the future.
