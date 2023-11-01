def solution(array, n):
    answer = 0
    
    if n in array:
        answer = n
    else:
        array.append(n)
        array.sort()
        idx = array.index(n)

        if len(array) == idx + 1:
            answer = array[idx-1]
        elif idx == 0:
            answer = array[idx+1]
        else:
            a = array[idx-1]
            b = array[idx+1]

            if n - a > b - n:
                answer = b
            else:
                answer = a
    return answer