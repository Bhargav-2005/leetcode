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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1==nullptr && list2==nullptr) return nullptr;
        ListNode dummy(0);
        ListNode *list=&dummy;
        while(list1!=nullptr && list2!=nullptr){
            if(list1->val<=list2->val){
                list->next=new ListNode(list1->val);
                list1=list1->next;
            }
            else{
                list->next=new ListNode(list2->val);
                list2=list2->next;
            }
            list=list->next;
        }
        while(list1!=NULL){
            list->next=new ListNode(list1->val);
            list1=list1->next;
            list=list->next;
        }
        while(list2!=NULL){
            list->next=new ListNode(list2->val);
            list2=list2->next;
            list=list->next;
        }
        return dummy.next;
    }
};