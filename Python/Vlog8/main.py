
# Build out a command line Black Jack game

import random

def deal_cards():
    cards = [2,3,4,5,6,7,8,9,10,10,10,10,11]
    card = random.choice(cards)
    return card

def calculate_hand(cards):
    if sum(cards) == 21 and len(cards) == 2:
        return 0

    if 11 in cards and sum(cards) > 21:
        cards.remove(11)
        cards.append(1)
    return sum(cards)

def compare_hands(player_score, dealer_score):
    if player_score > 21:
        return "You went over. You Lose!"
    elif dealer_score > 21:
        return "The dealer went over! You win!"
    elif player_score == dealer_score:
        return "Draw"
    elif player_score == 21:
        return "You got Blackjack!!"
    elif player_score > dealer_score:
        return "You have won!"
    else:
        return "You have lost, dealer wins"

def main ():
    print("Welcome to our BlackJack Game")
    player_cards = []
    dealer_cards = []
    game_loop = True


    for i in range(2):
        player_cards.append(deal_cards())
        dealer_cards.append(deal_cards())

    while game_loop:
        player_score = calculate_hand(player_cards)
        dealer_score = calculate_hand(dealer_cards)

        if player_score == 0 or dealer_score == 0 or player_score > 21:
            game_loop = False
        else:
            print("Your score is: " + str(player_score))
            player_deal = input("Type 'y' to get another card, type 'n' to pass: ")
            if player_deal == "y":
                player_cards.append(deal_cards())
            else: 
                game_loop = False

    while dealer_score != 0 and dealer_score < 17:
        dealer_cards.append(deal_cards())
        dealer_score = calculate_hand(dealer_cards)


    print(" Player's Score: "+ str(player_score))
    print(" Dealer's Score: " + str(dealer_score))    
    print(compare_hands(player_score,dealer_score))


if __name__ == '__main__':
   main()