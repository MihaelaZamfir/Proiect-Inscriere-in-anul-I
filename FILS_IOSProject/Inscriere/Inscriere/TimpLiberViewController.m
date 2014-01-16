//
//  TimpLiberViewController.m
//  ProiectDani
//
//  Created by Viorel Radu on 11/12/13.
//  Copyright (c) 2013 UPB. All rights reserved.
//

#import "TimpLiberViewController.h"
#import "ContentViewController.h"

@interface TimpLiberViewController ()

@property (weak, nonatomic) IBOutlet UIButton *regieCentruBtn;
@property (weak, nonatomic) IBOutlet UIButton *organizatiiStudentestiBtn;
@property (weak, nonatomic) IBOutlet UIButton *tipsTricksBtn;


- (IBAction)regieCentruBtnPressed:(id)sender;
- (IBAction)organizatiiStudentestiBtnPressed:(id)sender;
- (IBAction)tipsTricksBtnPressed:(id)sender;

@end

@implementation TimpLiberViewController


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


- (IBAction)regieCentruBtnPressed:(id)sender {
    ContentViewController* contentVC = [[ContentViewController alloc]init];
    contentVC.resourceName = @"TimpLiber";
    [self.navigationController pushViewController:contentVC animated:YES ];
}

- (IBAction)organizatiiStudentestiBtnPressed:(id)sender {
    ContentViewController* contentVC = [[ContentViewController alloc]init];
    contentVC.resourceName = @"OrganizatiiStud";
    [self.navigationController pushViewController:contentVC animated:YES ];
}

- (IBAction)tipsTricksBtnPressed:(id)sender {
}
@end
