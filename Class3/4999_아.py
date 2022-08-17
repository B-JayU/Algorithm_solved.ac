import sys
jaehwan = sys.stdin.readline()
doctor = sys.stdin.readline()

print("no" if len(jaehwan) < len(doctor) else "go")
