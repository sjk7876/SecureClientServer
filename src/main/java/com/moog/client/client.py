"""
Runs the client side of the model, where the client sends a
secure message to the server.

Author: Spencer Kurtz
"""

import requests

def main():    
    while(True):
        message = input("Input message: ")
        
        params = {'message': message}
        requests.post("https://localhost:8443/request", params=params, verify=False)
        
        

if (__name__ == "__main__"):
    main()
