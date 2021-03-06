package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaCockatrice extends ModelBase {
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer beak;
	ModelRenderer crown;
	ModelRenderer neck1;
	ModelRenderer neck2;
	ModelRenderer neck3;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer armjoint;
	ModelRenderer rightleg;
	ModelRenderer rightleglower;
	ModelRenderer rightclaw;
	ModelRenderer leftleg;
	ModelRenderer leftleglower;
	ModelRenderer leftclaw;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer tail3;
	ModelRenderer tail4;

	public ModelGaiaCockatrice() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-2F, -12F, -5.5F, 4, 4, 4);
		this.head.setRotationPoint(0F, 10.5F, -3F);
		this.head.setTextureSize(128, 64);
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 0, 12);
		this.headaccessory.addBox(-2.5F, -9F, -5.5F, 5, 3, 3);
		this.headaccessory.setRotationPoint(0F, 10.5F, -3F);
		this.headaccessory.setTextureSize(128, 64);
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.beak = new ModelRenderer(this, 0, 8);
		this.beak.addBox(-2F, -10F, -7.5F, 4, 2, 2);
		this.beak.setRotationPoint(0F, 10.5F, -3F);
		this.beak.setTextureSize(128, 64);
		this.setRotation(beak, 0F, 0F, 0F);
		this.crown = new ModelRenderer(this, 16, -5);
		this.crown.addBox(0F, -15F, -3.5F, 0, 5, 5);
		this.crown.setRotationPoint(0F, 10.5F, -3F);
		this.crown.setTextureSize(128, 64);
		this.setRotation(crown, 0F, 0F, 0F);
		this.neck1 = new ModelRenderer(this, 0, 18);
		this.neck1.addBox(-1F, -9F, -2.5F, 2, 3, 3);
		this.neck1.setRotationPoint(0F, 10.5F, -3F);
		this.neck1.setTextureSize(128, 64);
		this.setRotation(neck1, 0.2617994F, 0F, 0F);
		this.neck2 = new ModelRenderer(this, 0, 24);
		this.neck2.addBox(-1.5F, -6F, -2F, 3, 3, 4);
		this.neck2.setRotationPoint(0F, 10.5F, -3F);
		this.neck2.setTextureSize(128, 64);
		this.setRotation(neck2, 0.5235988F, 0F, 0F);
		this.neck3 = new ModelRenderer(this, 0, 31);
		this.neck3.addBox(-2F, -3F, -2F, 4, 3, 5);
		this.neck3.setRotationPoint(0F, 10.5F, -3F);
		this.neck3.setTextureSize(128, 64);
		this.setRotation(neck3, 0.7853982F, 0F, 0F);
		this.body = new ModelRenderer(this, 0, 39);
		this.body.addBox(-2.5F, 7F, -10F, 5, 8, 6);
		this.body.setRotationPoint(0F, 2F, -8F);
		this.body.setTextureSize(128, 64);
		this.setRotation(body, 1.308997F, 0F, 0F);
		this.rightarm = new ModelRenderer(this, 98, 38);
		this.rightarm.addBox(0F, -0.5F, -7F, 0, 16, 10);
		this.rightarm.setRotationPoint(-3F, 10F, 0F);
		this.rightarm.setTextureSize(128, 64);
		this.setRotation(rightarm, 2.181662F, 0F, 0.1745329F);
		this.leftarm = new ModelRenderer(this, 108, 38);
		this.leftarm.addBox(0F, -0.5F, -7F, 0, 16, 10);
		this.leftarm.setRotationPoint(3F, 10F, 0F);
		this.leftarm.setTextureSize(128, 64);
		this.setRotation(leftarm, 2.181662F, 0F, -0.1745329F);
		this.armjoint = new ModelRenderer(this, 26, 0);
		this.armjoint.addBox(-3.5F, -2F, -2F, 7, 3, 3);
		this.armjoint.setRotationPoint(0F, 11F, 0F);
		this.armjoint.setTextureSize(128, 64);
		this.setRotation(armjoint, 0.5235988F, 0F, 0F);
		this.rightleg = new ModelRenderer(this, 26, 6);
		this.rightleg.addBox(-1F, 0F, -1F, 2, 7, 2);
		this.rightleg.setRotationPoint(-2F, 11F, 0F);
		this.rightleg.setTextureSize(128, 64);
		this.setRotation(rightleg, 0.5235988F, 0F, 0F);
		this.rightleglower = new ModelRenderer(this, 26, 15);
		this.rightleglower.addBox(-0.5F, 4.5F, 4.5F, 1, 7, 1);
		this.rightleglower.setRotationPoint(-2F, 11F, 0F);
		this.rightleglower.setTextureSize(128, 64);
		this.setRotation(rightleglower, -0.2617994F, 0F, 0F);
		this.rightclaw = new ModelRenderer(this, 26, 23);
		this.rightclaw.addBox(-1F, 11F, -4F, 2, 1, 3);
		this.rightclaw.setRotationPoint(-2F, 11F, 0F);
		this.rightclaw.setTextureSize(128, 64);
		this.setRotation(rightclaw, 0.3316126F, 0F, 0F);
		this.leftleg = new ModelRenderer(this, 26, 6);
		this.leftleg.addBox(-1F, 0F, -1F, 2, 7, 2);
		this.leftleg.setRotationPoint(2F, 11F, 0F);
		this.leftleg.setTextureSize(128, 64);
		this.setRotation(leftleg, 0.5235988F, 0F, 0F);
		this.leftleglower = new ModelRenderer(this, 26, 15);
		this.leftleglower.addBox(-0.5F, 4.5F, 4.5F, 1, 7, 1);
		this.leftleglower.setRotationPoint(2F, 11F, 0F);
		this.leftleglower.setTextureSize(128, 64);
		this.setRotation(leftleglower, -0.2617994F, 0F, 0F);
		this.leftclaw = new ModelRenderer(this, 26, 23);
		this.leftclaw.addBox(-1F, 11F, -4F, 2, 1, 3);
		this.leftclaw.setRotationPoint(2F, 11F, 0F);
		this.leftclaw.setTextureSize(128, 64);
		this.setRotation(leftclaw, 0.3316126F, 0F, 0F);
		this.tail1 = new ModelRenderer(this, 26, 27);
		this.tail1.addBox(-2F, 0F, -1F, 4, 3, 4);
		this.tail1.setRotationPoint(0F, 12.5F, 4.5F);
		this.tail1.setTextureSize(128, 64);
		this.setRotation(tail1, 1.570796F, 0F, 0F);
		this.tail2 = new ModelRenderer(this, 26, 34);
		this.tail2.addBox(-1.5F, 3F, -1.5F, 3, 4, 3);
		this.tail2.setRotationPoint(0F, 12.5F, 4.5F);
		this.tail2.setTextureSize(128, 64);
		this.setRotation(tail2, 1.832596F, 0F, 0F);
		this.tail3 = new ModelRenderer(this, 26, 41);
		this.tail3.addBox(-1F, 7F, -1.5F, 2, 4, 2);
		this.tail3.setRotationPoint(0F, 12.5F, 4.5F);
		this.tail3.setTextureSize(128, 64);
		this.setRotation(tail3, 2.007129F, 0F, 0F);
		this.tail4 = new ModelRenderer(this, 26, 47);
		this.tail4.addBox(-0.5F, 11F, -1F, 1, 3, 1);
		this.tail4.setRotationPoint(0F, 12.5F, 4.5F);
		this.tail4.setTextureSize(128, 64);
		this.setRotation(tail4, 2.094395F, 0F, 0F);
		
		this.convertToChild(head, headaccessory);
		this.convertToChild(head, beak);
		this.convertToChild(head, crown);
		this.convertToChild(head, neck1);
		this.convertToChild(head, neck2);
		this.convertToChild(head, neck3);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
//		this.headaccessory.render(par7);
//		this.beak.render(par7);
//		this.crown.render(par7);
//		this.neck1.render(par7);
//		this.neck2.render(par7);
//		this.neck3.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.armjoint.render(par7);
		this.rightleg.render(par7);
		this.rightleglower.render(par7);
		this.rightclaw.render(par7);
		this.leftleg.render(par7);
		this.leftleglower.render(par7);
		this.leftclaw.render(par7);
		this.tail1.render(par7);
		this.tail2.render(par7);
		this.tail3.render(par7);
		this.tail4.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		//head
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		
		//legs
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2;
		this.rightleglower.rotateAngleX = this.rightleg.rotateAngleX - 0.2617994F;
		this.rightclaw.rotateAngleX = this.rightleg.rotateAngleX + 0.3316126F;
		this.rightleg.rotateAngleX += 0.5235988F;
		this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 0.8F * par2;
		this.leftleglower.rotateAngleX = this.leftleg.rotateAngleX - 0.2617994F;
		this.leftclaw.rotateAngleX = this.leftleg.rotateAngleX + 0.3316126F;
		this.leftleg.rotateAngleX += 0.5235988F;
	}
	
	protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild) {
		parChild.rotationPointX -= parParent.rotationPointX;
		parChild.rotationPointY -= parParent.rotationPointY;
		parChild.rotationPointZ -= parParent.rotationPointZ;
		parChild.rotateAngleX -= parParent.rotateAngleX;
		parChild.rotateAngleY -= parParent.rotateAngleY;
		parChild.rotateAngleZ -= parParent.rotateAngleZ;
		parParent.addChild(parChild);
	}
}
