def solution(answers):
    p1 = [1,2,3,4,5]
    p2 = [2,1,2,3,2,4,2,5]
    p3 = [3,3,1,1,2,2,4,4,5,5]
    
    c1,c2,c3 = 0, 0, 0
    for idx, correct in enumerate(answers):
        if p1[idx % len(p1)] == correct:
            c1 += 1
        if p2[idx % len(p2)] == correct:
            c2 += 1
        if p3[idx % len(p3)] == correct:
            c3 += 1
    answer = [c1,c2,c3]
    an = max(answer)
    co = []
    for x in range(3):
        if an == answer[x]:
            co.append(x+1)
    return co