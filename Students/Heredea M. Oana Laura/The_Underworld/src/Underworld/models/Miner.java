package Underworld.models;
import Underworld.utils.*;
public class Miner {
private String name;
private int[] backpack = {-1, -1, -1, -1, -1}  ;
public Miner(String name){
	
	this.name = name;
	//backpack = new int[] {-1, -1, -1, -1, -1};
}
public String getName(){

	return this.name;
}
public void SetName(String name){
	
	this.name = name;
}
public int dig(){
	int i, res ;
	if( !isBackPackFull() ){
	  res = Resources.generateResource();
	for(i = 0; i< backpack.length; i++){
		res = Resources.generateResource();
		if(backpack[i] == -1){
			backpack[i] = res;
			break;
			}
		}
	return res;
	}
	else{
		System.out.println("Backpack is full!");
	}
	return 0;
}
public int sleep(){
	int res = Resources.generateResource();
	return res;
}
private boolean isBackPackFull(){
	int i, ok = 0;
	for(i = 0; i < backpack.length; i++){
		if(backpack[i] != -1 ){
			ok ++;
		}
	}
	if( ok == backpack.length ){
		return true;
	}
	return false;
}
public void showBackPack(){
	int i;
	System.out.println("The miner has in his backpack canned beans, pickles, some wiskey and the following resources :");
	for(i = 0; i < backpack.length; i++){
		System.out.println (backpack[i]);
	}
}
private void getNumberOfBackpackSlots(){
	int i;
	System.out.println("The miner has space for more resources in the following pockets :");
	for(i = 0; i < backpack.length; i++){
		if(backpack[i] == -1){
			System.out.println( i );
		}
	}
}
}
