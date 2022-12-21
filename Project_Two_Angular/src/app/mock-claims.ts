import { Claim } from "./claim";

export const CLAIMS: Claim[] = [
    {
        user_id: 1,
        claim_id: 10,
        amount:100,
        description:'medicine',
        status:'denied',
        submision_date:'2022-20-12',
        decision_date:'2022-20-12',
    },

    {
        user_id: 2,
        claim_id: 11,
        amount:200,
        description: 'eyeglasses',
        status:'accepted',
        submision_date:'2022-20-12',
        decision_date:'2022-21-12',
    },

    {
        user_id: 3,
        claim_id: 13,
        amount:300,
        description:'broken leg',
        status:'accepted',
        submision_date:'2022-19-12',
        decision_date:'2022-20-12',
    },

    {
        user_id: 4,
        claim_id: 1,
        amount:400,
        description:'insulin',
        status:'pending',
        submision_date:'2022-20-12',
        decision_date:'',
    },

];