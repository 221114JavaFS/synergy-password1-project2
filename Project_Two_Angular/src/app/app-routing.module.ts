import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClaimDetailComponent } from './claim-detail/claim-detail.component';
import { ClaimsComponent } from './claims/claims.component';
import { MainMenuComponent } from './main-menu/main-menu.component';


const routes: Routes = [
  { path: '', redirectTo: '/main-menu', pathMatch: 'full' },
  { path: 'detail/:claim_id', component: ClaimDetailComponent },
  { path: 'claims', component: ClaimsComponent },
  {path: 'main-menu', component: MainMenuComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }