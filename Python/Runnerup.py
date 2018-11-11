if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    
    #Sort 
    for i in range(1,n,1):
        temp = arr[i]
        j=i-1
        while(j>=0 and arr[j]<temp):
            arr[j+1] = arr[j]
            j=j-1
        arr[j+1] = temp
    
    max = arr[0]
    for i in range(1,n,1):
        if(arr[i] < max):
            max = arr[i]
            break
    print(max)
