/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode *prev = NULL;
        ListNode *curr = head;
        while (curr != NULL){
            ListNode *nextTmp = curr -> next;
            curr -> next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }
};


#---------------------------------------------------------------

ListNode *reverseList(ListNode *head) {
    if (head == NULL || head -> next == NULL) return head;
    ListNode *p = reverseList(head -> next);
    head -> next -> next = head;
    head -> next = NULL;
    return p;
}
