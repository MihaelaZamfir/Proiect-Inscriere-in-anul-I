//
//  HomeViewController.m
//  ProiectDani
//
//  Created by Viorel Radu on 10/12/13.
//  Copyright (c) 2013 UPB. All rights reserved.
//

#import "HomeViewController.h"
#import "AdmitereViewController.h"

@interface HomeViewController ()

@property (weak, nonatomic) IBOutlet UIButton *admitereBtn;
@property (weak, nonatomic) IBOutlet UIButton *orientareBtn;
@property (weak, nonatomic) IBOutlet UIButton *timpLiberBtn;
@property (weak, nonatomic) IBOutlet UIButton *alteleBtn;
@property (weak, nonatomic) IBOutlet UIButton *aboutBtn;

- (IBAction)admitereBtnPressed:(id)sender;
- (IBAction)orientareBtnPressed:(id)sender;
- (IBAction)timpLiberBtnPressed:(id)sender;
- (IBAction)alteleBtnPressed:(id)sender;
- (IBAction)aboutBtnPressed:(id)sender;


@end


@implementation HomeViewController


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


- (IBAction)admitereBtnPressed:(id)sender {
    UITabBarController* tabBarController = self.tabBarController;
    //[tabBarController presentViewController:[tabBarController.viewControllers objectAtIndex:1] animated:YES completion:^{}];
    [tabBarController setSelectedIndex:1];
}

- (IBAction)orientareBtnPressed:(id)sender {
    UITabBarController* tabBarController = self.tabBarController;
    [tabBarController setSelectedIndex:4];
}

- (IBAction)timpLiberBtnPressed:(id)sender {
    UITabBarController* tabBarController = self.tabBarController;
   [tabBarController setSelectedIndex:2];
}

- (IBAction)alteleBtnPressed:(id)sender {
    UITabBarController* tabBarController = self.tabBarController;
    [tabBarController setSelectedIndex:5];
}

- (IBAction)aboutBtnPressed:(id)sender {
    UITabBarController* tabBarController = self.tabBarController;
    [tabBarController setSelectedIndex:3];
}
@end
