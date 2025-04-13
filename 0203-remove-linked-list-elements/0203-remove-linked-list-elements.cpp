/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        while(head!=nullptr && head->val==val){
            ListNode *temp=head;
            head=head->next;
            delete temp;
        }
        ListNode *crnt=head;
        while(crnt != nullptr && crnt->next!=nullptr){
            if(crnt->next->val==val){
                ListNode *prev=crnt->next;
                crnt->next=crnt->next->next;
                delete prev;
            }else
            crnt = crnt->next;
        }
        return head;
    //     ListNode* dummy = new ListNode(-1);
    // dummy->next = head;

    // ListNode* current = dummy;
    // while (current->next != nullptr) {
    //     if (current->next->val == val) {
    //         ListNode* nodeToDelete = current->next;
    //         current->next = current->next->next;
    //         delete nodeToDelete;
    //     } else {
    //         current = current->next;
    //     }
    // }

    // ListNode* newHead = dummy->next;
    // delete dummy;
    // return newHead;
    }
};