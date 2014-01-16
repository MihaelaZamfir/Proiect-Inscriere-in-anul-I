//
//  OrientareViewController.m
//  ProiectDani
//
//  Created by Viorel Radu on 11/12/13.
//  Copyright (c) 2013 UPB. All rights reserved.
//

#import "OrientareViewController.h"

@interface OrientareViewController ()

@property (weak, nonatomic) IBOutlet UIButton *oraraBtn;
@property (weak, nonatomic) IBOutlet UIButton *hartaBtn;
@property (weak, nonatomic) IBOutlet UIButton *accesBtn;

- (IBAction)orarBtnPressed:(id)sender;
- (IBAction)hartaBtnPressed:(id)sender;
- (IBAction)accesBtnPressed:(id)sender;


@end

@implementation OrientareViewController


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

- (IBAction)orarBtnPressed:(id)sender {
}

- (IBAction)hartaBtnPressed:(id)sender {
    UIViewController* viewController = [[UIViewController alloc]init];
    UIImageView* imageView = [[UIImageView alloc]init];
    viewController.view = imageView;
    imageView.image = [UIImage imageNamed:@"hartaUPB.png"];
    [self.navigationController pushViewController:viewController animated:YES];
}

- (IBAction)accesBtnPressed:(id)sender {
}
@end
