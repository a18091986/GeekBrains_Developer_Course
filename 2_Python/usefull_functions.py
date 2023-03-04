from colorama import Fore, Style

def print_separator_text(separator="*", text=''):
    print(f"{Fore.GREEN}{'*' * 100}\n{text}\n{'*' * 100}{Style.RESET_ALL}")


def my_print(msg: str, color='green', separator_sym="*", separator_before=False, separator_after=False) -> None:
    colors = {'yellow': Fore.YELLOW, 'желтый': Fore.YELLOW,
              'green': Fore.GREEN, 'зеленый': Fore.GREEN,
              'red': Fore.RED, 'красный': Fore.RED,
              'blue': Fore.BLUE, 'синий': Fore.BLUE,
              'magenta': Fore.MAGENTA, 'фиолетовый': Fore.MAGENTA,
              '1': Fore.WHITE
              }
    if separator_before:
        print(f"{Fore.RED}{separator_sym * 300}{Style.RESET_ALL}")
    if color in colors:
        print(f"{colors[color]}{msg}{Style.RESET_ALL}")
    else:
        print(f"{msg}")
    if separator_after:
        print(f"{Fore.RED}{separator_sym * 300}{Style.RESET_ALL}")


