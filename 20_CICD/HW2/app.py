import time
from datetime import datetime

for step in range(3):
    print(f"{step}: {datetime.now()}")
    time.sleep(1)