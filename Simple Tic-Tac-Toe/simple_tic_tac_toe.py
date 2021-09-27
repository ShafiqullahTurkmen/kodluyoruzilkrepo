n = '         '
game = [[n[0], n[1], n[2]], [n[3], n[4], n[5]], [n[6], n[7], n[8]]]


def print_game():
    print('---------')
    print('|', game[0][0], game[0][1], game[0][2], '|')
    print('|', game[1][0], game[1][1], game[1][2], '|')
    print('|', game[2][0], game[2][1], game[2][2], '|')
    print('---------')


def input_check():
    user_in = input('Enter the coordinates: ')
    while True:
        try:
            x = int(user_in[0])
            y = int(user_in[2])
            break
        except:
            print('You should enter numbers!')
            user_in = input('Enter the coordinates: ')
    a = [x, y]
    return a


def check_coordinates(s):
    user_input = input_check()
    x = int(user_input[0]) - 1
    y = int(user_input[1]) - 1
    while True:
        if x < 0 or x > 2 or y < 0 or y > 2:
            print('Coordinates should be from 1 to 3!')
        elif game[x][y] == 'X' or game[x][y] == 'O':
            print('This cell is occupied! Choose another one!')
        else:
            game[x][y] = s
            break

        user_input = input_check()
        x = int(user_input[0]) - 1
        y = int(user_input[1]) - 1


def play():
    print_game()
    counter = 0
    while counter < 9:
        if counter % 2 == 0:
            check_coordinates('X')
        else:
            check_coordinates('O')

        if game[0][0] == 'X' and game[0][1] == 'X' and game[0][2] == 'X' \
                or game[1][0] == 'X' and game[1][1] == 'X' and game[1][2] == 'X' \
                or game[2][0] == 'X' and game[2][1] == 'X' and game[2][2] == 'X':  # X horizontal
            print_game()
            print('X wins')
            break
        elif game[0][0] == 'O' and game[0][1] == 'O' and game[0][2] == 'O' \
                or game[1][0] == 'O' and game[1][1] == 'O' and game[1][2] == 'O' \
                or game[2][0] == 'O' and game[2][1] == 'O' and game[2][2] == 'O':  # O horizontal
            print_game()
            print('O wins')
            break
        elif game[0][0] == 'X' and game[1][0] == 'X' and game[2][0] == 'X' \
                or game[0][1] == 'X' and game[1][1] == 'X' and game[2][1] == 'X' \
                or game[0][2] == 'X' and game[1][2] == 'X' and game[2][2] == 'X':  # X vertical
            print_game()
            print('X wins')
            break
        elif game[0][0] == 'O' and game[1][0] == 'O' and game[2][0] == 'O' \
                or game[0][1] == 'O' and game[1][1] == 'O' and game[2][1] == 'O' \
                or game[0][2] == 'O' and game[2][1] == 'O' and game[2][2] == 'O':  # O vertical
            print_game()
            print('O wins')
            break
        elif game[0][0] == 'X' and game[1][1] == 'X' and game[2][2] == 'X' \
                or game[0][2] == 'X' and game[1][1] == 'X' and game[2][0] == 'X':  # X diagonal
            print_game()
            print('X wins')
            break
        elif game[0][0] == 'O' and game[1][1] == 'O' and game[2][2] == 'O' \
                or game[0][2] == 'O' and game[1][1] == 'O' and game[2][0] == 'O':  # O diagonal
            print_game()
            print('O wins')
            break
        elif counter > 7:
            print_game()
            print('Draw')
            break
        counter += 1
        print_game()


play()
