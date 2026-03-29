function evalRPN(tokens: string[]): number {

    if (!tokens || !tokens.length) return null;

    const s: Number[] = [];





    for (const token of tokens) {

        const num = Number(token);

        if (num !== NaN) s.push(num)
        else {
            const op2:number = s.pop();
            const op1:number = s.pop();


            switch (token) {
                   
                   case:"+":
                   s.push(op1 + op2);
                   break;

                   case:"-":
                   s.push(op1 + op2);
                   break;

                   
                   case:"*":
                   s.push(op1 * op2);
                   break;

                   
                   case:"/":
                   s.push(op1 / op2);
                   break;


            }

        }


    }

    return s[0];

};

{/* 
problem statement: https://leetcode.com/problems/evaluate-reverse-polish-notation/
solution : https://algo.monster/liteproblems/150
Time Complexity: O(n) 
Space Complexity: O(n) 
*/}
