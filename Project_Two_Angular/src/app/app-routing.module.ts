import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClaimDetailComponent } from './claim-detail/claim-detail.component';
import { ClaimsComponent } from './claims/claims.component';


const routes: Routes = [
  { path: 'detail/:claim_id', component: ClaimDetailComponent },
  { path: 'claims', component: ClaimsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }