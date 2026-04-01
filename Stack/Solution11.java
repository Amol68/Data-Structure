// description : https://leetcode.com/problems/next-greater-element-i/

var nextGreaterElement = function (nums1, nums2) {
    const n = nums2.length;
    const m = new Map();
    const s = [];
    const final = [];


    for (let i = n - 1; i >= 0; i--) {
        const element = nums2[i];

        while (s.length > 0 && s[s.length - 1] <= element) {
            s.pop();
        }

        m.set(element, s.length === 0 ? -1 : s[s.length - 1]);

        s.push(element);
    }

    // Lookup each nums1 element in the map
    for (const num of nums1) {
        final.push(m.get(num));
    }

    return final;
};

// time complexity : O(m+n);
// space complexity : O(m)
