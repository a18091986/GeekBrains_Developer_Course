import socket
import threading

nick = input("Input your name: ")

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('192.168.2.33', 55555))


def receive():
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if message == "NICK":
                client.send(nick.encode('ascii'))
            else:
                print(message)

        except:
            print("An error occured!")
            client.close()
            break


def write():
    while True:
        message = f'{nick}: {input()}'
        client.send(message.encode('ascii'))


receive_thread = threading.Thread(target=receive)
receive_thread.start()

write_thread = threading.Thread(target=write)
write_thread.start()
