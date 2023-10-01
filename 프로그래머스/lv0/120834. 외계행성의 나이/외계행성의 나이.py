def solution(age):
    ages = ['a','b','c','d','e','f','g','h','i','j']
    answer = ''
    for i in str(age):
        answer += ages[int(i)]
    return answer