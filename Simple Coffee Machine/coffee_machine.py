water = 400
milk = 540
coffee_beans = 120
cups = 9
money = 550

print('Write action (buy, fill, take, remaining, exit):')
n = input()
print()

while n != 'exit':
    if n == 'buy':
        print('What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:')
        x = input()
        if x == '1' and water >= 250 and coffee_beans >= 16 and cups >= 1:
            print('I have enough resources, making you a coffee!')
            water -= 250
            coffee_beans -= 16
            cups -= 1
            money += 4
        elif x == '2' and water >= 350 and milk >= 75 and coffee_beans >= 20 and cups >= 1:
            print('I have enough resources, making you a coffee!')
            water -= 350
            milk -= 75
            coffee_beans -= 20
            cups -= 1
            money += 7
        elif x == '3' and water >= 200 and milk >= 100 and coffee_beans >= 12 and cups >= 1:
            print('I have enough resources, making you a coffee!')
            water -= 200
            milk -= 100
            coffee_beans -= 12
            cups -= 1
            money += 6
        elif x == 'back':
            print()
        else:
            print('Sorry, not enough water!')
    elif n == 'fill':
        print('Write how many ml of water you want to add:')
        water += int(input())
        print('Write how many ml of milk you want to add:')
        milk += int(input())
        print('Write how many grams of coffee beans you want to add:')
        coffee_beans += int(input())
        print('Write how many disposable coffee cups you want to add:')
        cups += int(input())
    elif n == 'take':
        print(f'I gave you ${money}')
        money -= money
    elif n == 'remaining':
        print(f'The coffee machine has:\n{water} of water\n{milk} of milk\n{coffee_beans} of coffee beans\n{cups} of '
              f'disposable cups\n{money} of money')

    print()
    print('Write action (buy, fill, take, remaining, exit):')
    n = input()
    print()
