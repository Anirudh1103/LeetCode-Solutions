flowerbed = [1,0,0,0,0,1]
n = 1
c = 1
i = 0
j = 1
len = len(flowerbed)
while i < n:
    flag = False
    while j < len:
        if flowerbed[j-1]==0 and flowerbed[j+1] == 0:
            flowerbed[j] = 1
            flag = True
            i += 1
            j += 1
            if(j == len):
                break
            break
print(flowerbed)
print(flag)
            


            
            
        


    

