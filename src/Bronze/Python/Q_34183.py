import sys

input = sys.stdin.readline

S = input().rstrip()

match S[0]:
    case 'F':
        print("Foundation")
    case 'C':
        print("Claves")
    case 'V':
        print("Veritas")
    case 'E':
        print("Exploration")