from colorama import Fore, Style


def print_separator_text(separator="*", text=''):
    print(f"{Fore.GREEN}{'*' * 100}\n{text}\n{'*' * 100}{Style.RESET_ALL}")
