import {ModuleWithProviders} from '@angular/core';
import {Routes,RouterModules} from '@angular/router';
import {LoginComponent} from './componenets/login/login.component';

const appRoutes:Routes = [
{
path : '',
redirectTo: '/login',
pathMath: 'full'
}
{
path :'login',
component: LoginComponent
}
];
export const routing: ModuleWithProviders = RouterModule.forRoot{appRoutes);
