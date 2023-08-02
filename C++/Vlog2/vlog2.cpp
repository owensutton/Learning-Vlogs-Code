
// Rock Paper Scissors Game

#include <iostream>
#include <cstdlib>
#include <ctime>

int main(){

    int x;
    int y; 
    
    srand((unsigned) time(0));
    y = (rand() % 3) + 1;  

    std::cout << "Welcome, lets play Rock Paper Scissors!\n";
    std::cout << "1\n";
    std::cout << "2\n";
    std::cout << "3\n";
    std::cout << "Shoot!\n";
    std::cout << "1 for Rock, 2 for Paper, 3 for Scissors: ";
    std::cin >> x;

    switch(x){
        case 1:
         if(y==1){
            std::cout << "We both selected Rock, we tie!\n";
         }else if(y==2){
            std::cout << "You lost, I selected Paper!\n";
         }else if(y==3){
            std::cout << "You won, I selected Scissors!\n";
         }
         break;
        case 2:
         if(y==1){
            std::cout << "You won, I selected Rock!\n";
         }else if(y==2){
            std::cout << "We both selected Paper, we tie!\n";
         }else if(y==3){
            std::cout << "You lost, I selected Scissors!\n";
         }
         break;
        case 3:
         if(y==1){
            std::cout << "You lost, I selected Rock!\n";
         }else if(y==2){
            std::cout << "You won, I selected Paper!\n";
         }else if(y==3){
            std::cout << "We tie, we both selected Scissors!\n";
         }
         break;
    }
}