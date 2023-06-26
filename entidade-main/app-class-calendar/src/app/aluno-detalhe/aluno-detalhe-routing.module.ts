import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AlunoDetalhePage } from './aluno-detalhe.page';

const routes: Routes = [
  {
    path: '',
    component: AlunoDetalhePage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AlunoDetalhePageRoutingModule {}
