"""
Runs the client side of the model, where the client sends a
secure message to the server.

Author: Spencer Kurtz
"""

import requests
from random import random

def main():    
    while(True):
        # message = input("Input message: ")
        message = random() * 100000
        
        params = {'message': message}
        response = requests.post("http://localhost:8080/request", params=params)
        
        # print(response)
        

if (__name__ == "__main__"):
    main()
