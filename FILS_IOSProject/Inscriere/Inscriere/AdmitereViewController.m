//
//  AdmitereViewController.m
//  ProiectDani
//
//  Created by Viorel Radu on 10/12/13.
//  Copyright (c) 2013 UPB. All rights reserved.
//

#import "AdmitereViewController.h"
#import "ContentManager.h"

@interface AdmitereViewController ()
@property (weak, nonatomic) IBOutlet UIButton *ActeTaxeBtn;
@property (weak, nonatomic) IBOutlet UIButton *SecretariatBtn;
@property (weak, nonatomic) IBOutlet UIButton *SubiecteAnterioareBtn;

- (IBAction)acteTaxeBtnPressed:(id)sender;
- (IBAction)secretariatBtnPressed:(id)sender;
- (IBAction)subiecteAnterioarePressed:(id)sender;

@end

@implementation AdmitereViewController


- (void)viewDidLoad
{
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)acteTaxeBtnPressed:(id)sender {
    
    ContentViewController* contentVC = [[ContentViewController alloc]init];
    contentVC.resourceName = @"Admitere";
    [self.navigationController pushViewController:contentVC animated:YES ];
    
    
}

- (IBAction)secretariatBtnPressed:(id)sender {
}

- (IBAction)subiecteAnterioarePressed:(id)sender {
}

- (void) loadContent{
    
}

@end
