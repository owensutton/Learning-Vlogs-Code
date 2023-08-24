
## Building the Hangman game
import random

def main():
    # set game loop
    end_of_game = False
    # Create list of words to guess
    word_list = ["Hello","Game","Python", "Java"]
    # choose a random word from the list
    word = random.choice(word_list)
    # get length of word
    length = len(word)
    # player lives
    lives = 7
    word_display = []

    for a in range(length):
        word_display += "_"

    print("Welcome to the Hangman Game!")

    while not end_of_game:  
        guess = input("Guess a letter: ")

        for i in range(length):
            letter = word[i]

            if letter == guess:
                word_display[i] = letter
        
        if guess not in word:
            lives -= 1

            if lives == 0:
                print("No more lives left, You have lost!")
                print("The correct answer was: " + word)
                break
        
        print(f"{' '.join(word_display)}")

        if "_" not in word_display:
            end_of_game = True
            print("Congratulations you've won!!")
            break
        
        print("You have " + str(lives) + " remaining")
    


if __name__ == '__main__':
   main()