# ShapeBounncingProgram
The application, as given, is a simple bouncing program designed to let different shapes move around along various paths.

##Objective:

The aim of this program is to familiarize myself and have hands-on experience with oriented programming principles of inheritance and polymorphism. 

###Overview of the program:
 
Creating a shape: The user can create a new shape by clicking anywhere within the panel area of the program. The properties of the newly created shape are based on the current values saved in the appropriate UI fields (e.g. height, width border colour, fill colour and path). Once created, the shape will start moving.
 
Selecting/deselecting shapes: A user can select a shape by clicking anywhere on the shape. A selected shape shows all its handles. The user can then change the path types / widths / heights /border colours / fill colours for all selected shapes by changing the current values with the help of the tools provided at the top of the application interface. (Note: The shape type itself cannot be modified once a shape has been created.) Clicking on a selected shape will deselect it.
   
###Tools in the Application:

Shape combo box: The ‘Shape’ combo box lets you select the shape type for the new shapes that get created when you click on the panel area.Clicking in the panel area to create a shape as described above will then create a shape of the selected type.  

Path combo box: 
Users may select one of several moving paths for shapes from the ‘Path’ combo box. Selecting a new path changes the path of all currently selected shapes. The newly selected path also becomes the current path for any new shapes that the user creates. 

Width text field: Users may change the current width for new shapes and currently selected shapes by entering a valid number in the width text field and pressing “ENTER”.  

Height text field: Users may change the current height of new shapes and currently selected shapes by entering a valid number in the height text field and pressing “ENTER”.  Border button Users may change the current border colour of new shapes and currently selected shapes by pressing the border button. 

Fill button Users may change the current fill colour of new shapes and currently selected shapes by pressing the fill button. 

Start button: Starts the animation. 

Stop button: Stops the animation. 

Animation slider: Users may use the animation delay slider to adjust the speed of the animation. 
 
Popup menu: 
The application has a popup menu, which is activated by clicking the right mouse button anywhere in the panel area (on a windows machine). The popup menu contains a menu item called “Clear All” which allows the user to clear all shapes from the program. 
