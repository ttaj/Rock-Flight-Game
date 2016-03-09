package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

// [Taj] Use this class to handle all forms of input.
public class input
{
	rockDodge game;
	background back;
	String text;
	Menu menu;
	public input(rockDodge game)
	{
		this.game = game; // [Taj] You know the drill....
		this.text = "No input";
		this.back = game.getBackground();
		this.menu = game.getMenu();
	}
	
	public void update()
	{
		// [Taj] Does whatever is inside the brackets if the up arrow key is pressed.
		if(Gdx.input.isKeyPressed(Input.Keys.UP))
		{
			// [Alex] Don't need
			//text = "up";
			
			// [Tran] Test to change menu state.
				menu.setState(1);    
				
			// [Alex] calling moveUp function
				game.curPlayer.moveUp();
		}
		
		// [Taj] Guess what this does :p
		else if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
		{
			// [Taj] This is just an example, we will draw text that says "down"
			//text = "down";
			
			// [Alex] calling moveDown function
			game.curPlayer.moveDown();
		}
		//else if(Gdx.input.isButtonPressed(Input.Key)
		else
		{
			// [Alex] Don't need
			//text = "No input";
		}
		
		
		// [Tran] Test to change color, this also functions as key not pressed.
		if(!Gdx.input.isKeyPressed(Input.Keys.UP))
		{
			menu.setState(0);
		
		}
		
		// [Alex] Because Talha TOLD ME TO!
		//game.curPlayer.renderText(text);			
	}
}
